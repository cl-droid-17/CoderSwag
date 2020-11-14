package com.example.coderswag.Model

class Category (val title: String, val image: String) {
    override fun toString(): String {               // ajouté pour qu'il affiche le titre
        return title                                // au lieu de com.example.coderswag.Model
    }                                               // .Category@f3950c4 (memory adresses)
}
