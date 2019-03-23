package lnr.hk.no.labbisv2

import android.app.ActionBar
import android.app.LauncherActivity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //BtnClick skal føre videre til fragment med createPet
        var findAddPetBtn = findViewById<Button>(R.id.addPetBtn)

        findAddPetBtn.setOnClickListener {
            println("Hello World!")
            Toast.makeText(this, "Fragment kommer her!", Toast.LENGTH_LONG).show()
        }

        //OnItemClickListener skal føre til fragment som lar bruker se kjæledyret sitt
//        var findPetItem = findViewById<ListView>(R.id.petsList)
//
//        findPetItem.setOnItemClickListener{
//             Toast.makeText(this, "Hello PetITEM!", Toast.LENGTH_LONG).show()
//        }


        //Kobler pet-listen med activitien
        var petsListview = findViewById<ListView>(R.id.petsList)

        var examplePets = listOf("Fido", "Grace", "Frankie", "Hansen")

        var petListAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, examplePets)

        petsListview.adapter = petListAdapter

    }
}

