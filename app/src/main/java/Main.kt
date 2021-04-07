import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main() {

    // in Kotlin the Base class for all other classes is Any

//    val enemy = Enemy("Test enemy.Enemy", 50, 3)
//    enemy.takeDamage(60)
//    println(enemy)
//
//    val uglyTroll = Troll("Ugly enemy.Troll")
//    println(uglyTroll)
//    uglyTroll.takeDamage(30)
//    println(uglyTroll)
//
//    val vlad = Vampire("Vlad")
//    println(vlad)
//    vlad.takeDamage(8)
//    println(vlad)
//
//    val dracula = VampireKing("Dracula")
//    println(dracula)
//    for (i in 1..10) {
//        // loops as long the condition is true
//        while (dracula.lives > 0) {
//            if (dracula.dodges()) {
//                continue
//                // jumps back at the beginning of the loop
//            }
//            if (dracula.runAway()) {
//                println("Dracula ran away!")
//                break
//                // ends the loop
//            } else {
//                dracula.takeDamage(40)
//            }
//        }
//        println("+++++++++++++++++++++++++")
//    }

    val conan = Player("Conan")
    conan.getLoot(Loot("Invisibility", LootType.POTION, 4.0))
    conan.getLoot(Loot("Mithril", LootType.ARMOUR, 183.0))
    conan.getLoot(Loot("Ring of speed", LootType.RING, 25.0))
    conan.getLoot(Loot("Red Potion", LootType.POTION, 2.0))
    // conan.getLoot(Loot("Cursed Shield", LootType.ARMOUR, -8.0))
    conan.getLoot(Loot("Brass Ring", LootType.RING, 1.0))
    conan.getLoot(Loot("Chain Mail", LootType.ARMOUR, 4.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING, 12.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING, 12.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING, 12.0))
    conan.getLoot(Loot("Health Potion", LootType.POTION, 3.0))
    conan.getLoot(Loot("Silver Ring", LootType.RING, 6.0))
    conan.getLoot(Loot("Silver Ring", LootType.RING, 6.0))
    conan.showInventory()

    conan.dropLoot("Gold Ring")
    conan.showInventory()

    conan.dropLoot("Silver Ring")
    conan.showInventory()

    // checks if the sword is in the list and returns and prints "false" because it isn't
    val dropped = conan.dropLoot("Some Sword")
    println(dropped)

    // do..while loop executes the code at least once
//    dracula.lives = 0
//    do {
//        if (dracula.dodges()) {
//            dracula.lives += 1
//            continue
//            // jumps back at the beginning of the loop
//        }
//        if (dracula.runAway()) {
//            println("Dracula ran away!")
//            break
//            // ends the loop
//        } else {
//            dracula.takeDamage(40)
//        }
//    } while (dracula.lives > 0)
//    println("****************")
}



