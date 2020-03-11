interface SkillSet {
    fun skill() { println("Printing Skill")}
}

interface Ammunition {
    fun attack() {println("The war has begun")}
}



interface Bullets: Ammunition {
    override fun attack() {println("Bullets fired")}
}

interface Swords: Ammunition {
    override fun attack() {println("You are slayed")}
}


interface Horse: SkillSet {
    override fun skill() {println("Horse running Balleee Ballee")}  
}

interface Guns: SkillSet {
    override fun skill() {println("Gun Shooting Dishum Dishum")}  
}



class HorseObj(var type:Int) : Horse {
    var height:Int = 0
    get(){
        return height
    }
    //, weight:Int, speed:Int
     override fun skill() {
        when(this.type){
            1 -> height=10;
                //  weight=100;
                //  speed=50
            2 -> height=20;
                //  weight=150;
                //  speed=60

            3 -> height=30;
                //  weight=200;
                //  speed=70
        }
        println("Horse$type is running at 50 Km/hr Ballee Ballee!!!")
        }
}

class GunObj(var type:Int) : Guns {
    var capacity:Int=0
        get(){
            return capacity
        }
    //, power:Int, weight:Int
    override fun skill() {
        when(this.type){
            1 -> capacity=10;
                //  power=100;
                //  weight=50
            2 -> capacity=20;
                //  power=150;
                //  weight=60

            3 -> capacity=30;
                //  power=200;
                //  weight=70
        }
        println("Gun$type is Shooting Dishum Dishum!!!")
        }
}

class BulletObj(var type:Int) : Bullets {
    var size:Int =0
        get(){
            return size
        }
    //, power:Int, weight:Int
     fun skill() {
        when(this.type){
            1 -> size=10;
                //  power=100;
                //  weight=50
            2 -> size=20;
                //  power=150;
                //  weight=60
            3 -> size=30;
                //  power=200;
                //  weight=70
        }
        println("Bullet$type is fired!!!")
    }
}

class SwordObj(var type:Int) : Swords {
    var length:Int =0
    get(){
        return length
    }
    //, sharpness:Int
     fun skill() {
        when(this.type){
            1 -> length=10;
                //  sharpness=100
            2 -> length=20;
                //  sharpness=60
            3 -> length=30;
                //  sharpness=70
        }
        println("Sword$type is going to cut your head!!")
    }
}

fun main(){
    val h1 = HorseObj(2)
    h1.skill()
}
