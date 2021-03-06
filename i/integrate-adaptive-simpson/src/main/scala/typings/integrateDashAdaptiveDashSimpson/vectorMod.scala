package typings.integrateDashAdaptiveDashSimpson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("integrate-adaptive-simpson/vector", JSImport.Namespace)
@js.native
object vectorMod extends js.Object {
  def apply(f: Func, a: Double, b: Double): js.Array[Double] = js.native
  def apply(f: Func, a: Double, b: Double, tol: Double): js.Array[Double] = js.native
  def apply(f: Func, a: Double, b: Double, tol: Double, maxdepth: Double): js.Array[Double] = js.native
  type Func = js.Function1[/* val */ Double, Double]
}

