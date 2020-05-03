package com.mingyuliumr.tohacks;

import android.content.Context;
import android.location.Location;

import org.jetbrains.annotations.NotNull;

import io.radar.sdk.Radar;
import io.radar.sdk.RadarReceiver;
import io.radar.sdk.model.RadarEvent;
import io.radar.sdk.model.RadarUser;

public class MyRadarReceiver extends RadarReceiver {


    @Override
    public void onClientLocationUpdated(@NotNull Context context, @NotNull Location location, boolean b, @NotNull Radar.RadarLocationSource radarLocationSource) {
        if(b == true){
            FullscreenActivity.isAtHome = false;
        }
        else{
            FullscreenActivity.isAtHome = true;
        }
    }

    @Override
    public void onError(@NotNull Context context, @NotNull Radar.RadarStatus radarStatus) {

    }

    @Override
    public void onEventsReceived(@NotNull Context context, @NotNull RadarEvent[] radarEvents, @NotNull RadarUser radarUser) {

    }

    @Override
    public void onLocationUpdated(@NotNull Context context, @NotNull Location location, @NotNull RadarUser radarUser) {

    }

    @Override
    public void onLog(@NotNull Context context, @NotNull String s) {

    }
}
