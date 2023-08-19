package com.example.triquinr.datos

import android.os.Parcel
import android.os.Parcelable

class Pais : Parcelable {
    var capital: String
    var nomPais: String
    var nomPaisInt: String
    var sigla: String
    var bandera: String

    constructor(nomPais: String, capital: String, nomPaisInt: String, sigla: String, bandera: String) {
        this.nomPais = nomPais
        this.capital = capital
        this.nomPaisInt = nomPaisInt
        this.sigla = sigla
        this.bandera = bandera
    }

    override fun toString(): String {
        return nomPais
    }

    // Implementación de Parcelable
    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: ""
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(capital)
        parcel.writeString(nomPais)
        parcel.writeString(nomPaisInt)
        parcel.writeString(sigla)
        parcel.writeString(bandera)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Pais> {
        override fun createFromParcel(parcel: Parcel): Pais {
            return Pais(parcel)
        }

        override fun newArray(size: Int): Array<Pais?> {
            return arrayOfNulls(size)
        }
    }
}
