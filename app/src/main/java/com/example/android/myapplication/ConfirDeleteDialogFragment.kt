package com.example.android.myapplication

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.util.Log

class ConfirDeleteDialogFragment : DialogFragment() {

    interface ConfirmDeleteListener {
        fun onDialogPositivClick()
        fun onDialogNegativClick()
    }

    val TAG = ConfirDeleteDialogFragment::class.java.simpleName;

    var listener: ConfirmDeleteListener? = null;

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        // on crée un objet buider par rapport à AlertDialog
        val builder = AlertDialog.Builder(activity);

        // définir le message qui sera affiché à l'intérieur
        builder.setMessage("Supprimer tout le contenu du téléphone ?")
            .setPositiveButton("oh oui !", object: DialogInterface.OnClickListener {
                override fun onClick(dialog: DialogInterface?, id: Int) {
                    Log.i(TAG, "Youpi !");
                    listener?.onDialogPositivClick();
                }
            })
            .setNegativeButton("Euh... Non", DialogInterface.OnClickListener {dialog, id ->
                Log.i(TAG, "Ce sera pour la prochaine fois");
                listener?.onDialogNegativClick();
            })

        // créer la dialog
        return builder.create();
    }
}