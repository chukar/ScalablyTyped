package typings.pathfinding.pathfindingMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grid
  extends Instantiable1[/* matrix */ js.Array[js.Array[Double]], Grid]
     with Instantiable2[/* width */ Double, /* height */ Double, Grid] {
  var height: Double = js.native
  var width: Double = js.native
  def getNeighbors(node: Node, diagonalMovement: DiagonalMovement): js.Array[Node] = js.native
  def getNodeAt(x: Double, y: Double): Node = js.native
  def isInside(x: Double, y: Double): Boolean = js.native
  def isWalkableAt(x: Double, y: Double): Boolean = js.native
  def setWalkableAt(x: Double, y: Double, walkable: Boolean): Unit = js.native
}

@JSImport("pathfinding", "Grid")
@js.native
object Grid extends TopLevel[Grid]

