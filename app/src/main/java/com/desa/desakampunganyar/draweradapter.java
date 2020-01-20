package com.desa.desakampunganyar;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.desa.desakampunganyar.PlayVideoActivity;
import com.desa.desakampunganyar.iconsicon;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.util.List;

public class draweradapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements MediaPlayer.OnPreparedListener
{

    private List<iconsicon> mlist;
    private Context mcontext;
    private LayoutInflater minflater;
    private iconsicon miconsicon;
    private DrawerLayout mdrawer;
    private MediaPlayer mediaPlayer = new MediaPlayer();
    private int selected_index = -1;
    //private String osuri="none";


    draweradapter(Context context, List<iconsicon> list, DrawerLayout drawer) {
        mlist = list;
        mdrawer = drawer;
        mcontext = context;
        minflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = minflater.inflate(R.layout.snackbarrecycler, parent, false);

        return new MyHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder holder, final int position) {

        final MyHolder myholder = (MyHolder) holder;
        miconsicon = mlist.get(position);
        final String nama = miconsicon.getNama();
        final double lat = miconsicon.getLat();
        final double lng = miconsicon.getLng();
        final String suri = miconsicon.getSuri();
        final String uri = miconsicon.getUri();


        myholder.nmicon.setText(miconsicon.getNama());
        //myholder.fotoicon.setImageResource(miconsicon.getIcons());
        Picasso.get().load(uri).resize(35,35).into(myholder.fotoicon);

        /**
         * OnClick Handler for play sound btn
         */
        myholder.btniconsound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(mcontext, PlayVideoActivity.class);
                intent.putExtra("VideoUri",suri);
                mcontext.startActivity(intent);

                    /*if(mediaPlayer.isPlaying()) {
                        Toast.makeText(mcontext,"Released",Toast.LENGTH_SHORT).show();
                        mediaPlayer.release();
                        mediaPlayer = new MediaPlayer();
                    }else if(osuri.equals(suri)){
                        osuri = "none";
                    }

                    if (!osuri.equals(suri)) {
                        fetchAudioUrlFromFirebase(suri);
                        osuri = suri;
                    }

                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                            mediaPlayer = new MediaPlayer();
                        }
                    });*/
            }

        });

        /**
         * OnClick Handler for itemView
         */
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mdrawer.closeDrawer(GravityCompat.START);
                miconsicon.mapFragment.updateMap(lat,lng,nama);
                selected_index = position;
                notifyDataSetChanged();
            }
        });

        if(selected_index == position){
            holder.itemView.setBackgroundColor(Color.parseColor("#00574B"));
            myholder.nmicon.setTextColor(Color.parseColor("#ffffff"));
            myholder.btniconsound.setVisibility(View.VISIBLE);
        }else{
            holder.itemView.setBackgroundColor(Color.parseColor("#ffffff"));
            myholder.nmicon.setTextColor(Color.parseColor("#000000"));
            myholder.btniconsound.setVisibility(View.INVISIBLE);
        }

    }

    /**
     *  Here is the part where we fethcing audio from firebase to our app
     * @param suri (stands for Sound uri) a variable that contain path of the song
     */
    private void fetchAudioUrlFromFirebase(String suri) {
        final FirebaseStorage storage = FirebaseStorage.getInstance();
        StorageReference storageRef = storage.getReferenceFromUrl(suri);

        storageRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                try {
                    String url = uri.toString();
                    mediaPlayer.setDataSource(url);
                    // wait for media player to get prepare
                    mediaPlayer.setOnPreparedListener(draweradapter.this);
                    mediaPlayer.prepareAsync();
                } catch (IOException e) {
                    Toast.makeText(mcontext,"failed to load sounds",Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    @Override
    public void onPrepared(MediaPlayer mediaPlayer) {
        mediaPlayer.start();
    }

    class MyHolder extends RecyclerView.ViewHolder {
        ImageView fotoicon;
        TextView nmicon;
        Button btniconsound;

        MyHolder(@NonNull View itemView) {
            super(itemView);

            nmicon = itemView.findViewById(R.id.textdrawer);
            fotoicon = itemView.findViewById(R.id.images);
            btniconsound = itemView.findViewById(R.id.playson);

        }
    }

}

