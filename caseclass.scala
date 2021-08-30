import math.{sqrt, pow}
object caseclass extends App {
    val p1 = new Point(2, 3)
    val p2 = new Point(5, 6)

    println("Question 1")
    println(p1)
    println(p2)
    println(p1+p2)

    println("\nQuestion 2")
    println(p1)
    println(p1.move(2,2))
    println(p2)
    println(p2.move(2,2))

    println("\nQuestion 3")
    println(p1)
    println(p2)
    println(p1.distance(p2))

    println("\nQuestion 4")
    println(p1)
    println(p1.invert)
    println(p2)
    println(p2.invert)


  }

  case class Point(a:Int, b:Int){
    def x: Int =a
    def y: Int =b

    //Question 1
    def +(that:Point)=Point(this.x+that.x,this.y+that.y)

    //Question 2
    def move(dx:Int ,dy:Int) = Point(this.x+dx, this.y+dy)

    //Question 3
    def distance(that:Point):Double= sqrt(pow(this.x-that.x,2) + pow(this.y-that.y,2))

    //Question 4
    def invert = Point(this.y, this.x)
  }



