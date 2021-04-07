class Player(val name: String, val level: Int = 1, val lives: Int = 3, val score : Int = 0) {

    var weapon : Weapon = Weapon("Fist", 1)
    val inventory = ArrayList<Loot>()

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

    fun showInventory() {
        // total value of the Loot from the inventory
        var total = 0.0
        println("$name's Inventory")
        for(item in inventory) {
            println(item)
            total += item.value
        }
        println("==============")
        println("Total score is $total")
        println("==============")
    }

    // encapsulation
    fun getLoot(item: Loot) {
        inventory.add(item)
    }

    // version nr 1, which takes as parameter an object
    fun dropLoot(item: Loot) : Boolean {
        return if (inventory.contains(item)) {
            inventory.remove(item)
            true
        } else {
            false
        }
    }

    // version nr 2, which takes as parameter a String
//    @RequiresApi(Build.VERSION_CODES.N)
//    fun dropLoot(name: String) : Boolean {
//        println("$name will be dropped")
//        return inventory.removeIf { it.name == name }
//    }

      // version nr 3
//    fun dropLoot(name: String) : Boolean {
//        for (item in inventory) {
//            if (item.name == name) {
//                inventory.remove(item)
//                println("$name will be dropped")
//                return true
//            }
//        }
//        return false
//    }

      // version nr 4
//    fun dropLoot(name: String) :Boolean {
//        var result = false
//        for (item in inventory) {
//            if (item.name == name) {
//                inventory.remove(item)
//                result = true
//                break
//            }
//        }
//        return result
//    }

    // version nr 5
    fun dropLoot(name: String) : Boolean {
        for (item in inventory) {
            if (item.name == name) {
                inventory -= item
                println("$name has been removed from inventory!")
                break
            }
        }
        return false
    }
}