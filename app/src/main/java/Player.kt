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
        println("$name's Inventory")
        for(item in inventory) {
            println(item)
        }
        println("==============")
    }
}