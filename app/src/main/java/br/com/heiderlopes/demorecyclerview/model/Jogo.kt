package br.com.heiderlopes.demorecyclerview.model

import android.os.Parcel
import android.os.Parcelable

data class Jogo(val resourceId: Int,
                val titulo: String,
                val anoLancamento: Int,
                val descricao: Int,
                val resourceDetailId: Int) : Parcelable {

    constructor(parcel: Parcel) : this(
            parcel.readInt(),
            parcel.readString(),
            parcel.readInt(),
            parcel.readInt(),
            parcel.readInt())

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(resourceId)
        parcel.writeString(titulo)
        parcel.writeInt(anoLancamento)
        parcel.writeInt(descricao)
        parcel.writeInt(resourceDetailId)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Jogo> {
        override fun createFromParcel(parcel: Parcel): Jogo {
            return Jogo(parcel)
        }

        override fun newArray(size: Int): Array<Jogo?> {
            return arrayOfNulls(size)
        }
    }
}