import android.os.Build
import androidx.annotation.RequiresApi

class Player(val name: String, val level: Int = 1, val lives: Int = 3, val score : Int = 0) {

    var weapon : Weapon = Weapon("Fist", 1)
    // encapsulation
    private val inventory = ArrayList<Loot>()

    fun show() {
        if(lives > 0) {
            println("$name is alive")
        } else {
            println("$name is dead")
        }
    }

   override fun toString(): String {
        return """
                name: $name
                lives: $lives
                level: $level
                score: $score
                weapon: $weapon
            """
    }

    // encapsulation
    fun getLoot(item: Loot) {
        inventory.add(item)
    }

    // version 1, parameter Object
    fun dropLoot(item: Loot) : Boolean {
        return if (inventory.contains(item)) {
            inventory.remove(item)
            true
        } else {
            false
        }
    }

    // version 2, parameter String
    // overloading fun dropLoot from above
    @RequiresApi(Build.VERSION_CODES.N)
    fun dropLoot(name: String) : Boolean {
        println("$name will be dropped")
        return inventory.removeIf { it.name == name }
    }

    fun showInventory() {
        println("$name's Inventory")
        for(item in inventory) {
            println(item)
        }
        println("==============")
    }
}