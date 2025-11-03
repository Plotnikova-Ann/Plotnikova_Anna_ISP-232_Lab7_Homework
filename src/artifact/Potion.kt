//package artifact
//class Potion(
//    name: String,
//    power: Int,
//    rarity: String,
//    val effectDuration: Int,
//    val isConsumable: Boolean
//) : MagicItem(name, power, rarity) {
//
//    override fun describe() {
//        super.describe()
//        println("Длительность эффекта: $effectDuration сек, Одноразовое: $isConsumable")
//    }
//
//    override fun use(): String {
//        return if (isConsumable) {
//            "Зелье $name выпито, эффект длится $effectDuration секунд"
//        } else {
//            "Зелье $name использовано, можно использовать снова"
//        }
//    }
//}
