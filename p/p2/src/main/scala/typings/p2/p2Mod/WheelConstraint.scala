package typings.p2.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "WheelConstraint")
@js.native
class WheelConstraint protected () extends Constraint {
  def this(vehicle: TopDownVehicle) = this()
  def this(vehicle: TopDownVehicle, options: WheelConstraintOptions) = this()
  var engineForce: Double = js.native
  var forwardEquation: FrictionEquation = js.native
  var localForwardVector: js.Tuple2[Double, Double] = js.native
  var localPosition: js.Tuple2[Double, Double] = js.native
  var sideEquation: FrictionEquation = js.native
  var steerValue: Double = js.native
  var vehicle: TopDownVehicle = js.native
  def getSpeed(): Double = js.native
  def setBrakeForce(force: Double): Unit = js.native
  def setSideFriction(force: Double): Unit = js.native
}

