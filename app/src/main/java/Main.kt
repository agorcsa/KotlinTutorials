import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main() {

    /*println("My first Kotlin line")
val tim = "Tim"
println(tim)

println()

val weeklySalary = 32
val timsMonthlySalary : Int = weeklySalary * 4
println("Tim's weekly salary is $weeklySalary$")
println("Tim's monthly salary is $timsMonthlySalary$")

println()

val apples = 6
val oranges = 5
val fruit : Int = apples + oranges
println("We have $fruit fruits.")
println("A quarter of the apples is ${apples / 4}")
println("In the basket we have $apples apples and $oranges oranges, which makes a total of $fruit fruits.")

println()

val weeks = 234
val years : Double = weeks/52.0
println("$weeks weeks in years is $years years")
println("We have $weeks weeks.")

println()

val jim = "James T. Kirk"
println("My name is $tim")
println("Jim is $jim")*/

    // conditionals
    /*val lives = 3

    var isGameOver = (lives < 1)
    println(isGameOver)

    if(isGameOver) {
        println("Game over!")
    } else {
        println("You're still alive!")
    }*/

    /*println("How old are you: ")
    val age = readLine()!!.toInt()
    println("My age is $age")

    var message = ""
    message = when {
        age < 18 -> {
            "You're too young to vote"
        }
        age == 100 -> {
            "Congratulations!"
        }
        else -> {
            "You can vote"
        }
    }
    println(message)*/

    // classes
    val tim = Player("Tim")
    val louise = Player("Louise", 6)
    val john = Player("John", 4, 8)
    val mary = Player("Mary", 2, 5, 1000)

   // println(mary.weapon.name.toUpperCase())
   // println(mary.weapon.damageInflicted)


    val axe = Weapon("Axe", 12)
    john.weapon = axe
    // 2 references to the same object "axe"
    println(john.weapon.name)
    println(axe.name)

    axe.damageInflicted = 24
    println(axe.damageInflicted)
    println(john.weapon.damageInflicted)

    var sword = Weapon("Sword", 10)

    // direct assignment of the weapon to tim
    tim.weapon = sword
    //println(tim.weapon.name)

    // louise takes the weapon from tim
    louise.weapon = tim.weapon
    //println(louise.weapon.name)

    tim.weapon = Weapon("Spear", 14)
    //println(tim.weapon.name)

    tim.show()
    louise.show()
    john.show()
    mary.show()

    val redPotion = Loot("RedPotion", LootType.POTION, 7.50)
    tim.getLoot(redPotion)
    val chestArmor = Loot("+3 Chest Armor", LootType.ARMOUR, 80.0)
    tim.getLoot(chestArmor)
    tim.getLoot(Loot("+2 Ring of Protection", LootType.RING, 40.25))
    tim.getLoot(Loot("Invisibility Potion", LootType.POTION, 35.95))
    tim.showInventory()

    if (tim.dropLoot(redPotion)) {
        tim.showInventory()
    } else {
        println("You don't have a ${redPotion.name}")
    }

    val bluePotion = Loot("Blue Potion", LootType.POTION, 6.00)
    if (tim.dropLoot(bluePotion)) {
        tim.showInventory()
    } else {
        println("You don't have a ${bluePotion.name}")
    }

    if(tim.dropLoot("Invisibility Potion")) {
        tim.showInventory()
    } else {
        println("You don't have an Invisibility Potion")
    }
}


