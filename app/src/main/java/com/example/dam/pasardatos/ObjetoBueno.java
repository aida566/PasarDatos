package com.example.dam.pasardatos;

import android.os.Parcel;
import android.os.Parcelable;

//Esta es la forma correcta, hay que implementar dos veces los métodos.

public class ObjetoBueno implements Parcelable {

    private int i;

    public ObjetoBueno(int i) {
        this.i = i;
    }

    protected ObjetoBueno(Parcel in) {
        i = in.readInt();
    }

    public static final Creator<ObjetoBueno> CREATOR = new Creator<ObjetoBueno>() {
        @Override
        public ObjetoBueno createFromParcel(Parcel in) {
            return new ObjetoBueno(in);
        }

        @Override
        public ObjetoBueno[] newArray(int size) {
            return new ObjetoBueno[size];
        }
    };

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(i);
    }
}
