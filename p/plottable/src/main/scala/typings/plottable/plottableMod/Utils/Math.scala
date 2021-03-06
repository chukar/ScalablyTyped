package typings.plottable.plottableMod.Utils

import typings.plottable.buildSrcCoreInterfacesMod.Bounds
import typings.plottable.buildSrcCoreInterfacesMod.Point
import typings.plottable.buildSrcUtilsMathUtilsMod.ICssTransformMatrix
import typings.plottable.buildSrcUtilsMathUtilsMod.ITranslateVector
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable", "Utils.Math")
@js.native
object Math extends js.Object {
  def applyTransform(a: ICssTransformMatrix, p: Point): Point = js.native
  def boundsIntersects(
    aX: Double,
    aY: Double,
    aWidth: Double,
    aHeight: Double,
    bX: Double,
    bY: Double,
    bWidth: Double,
    bHeight: Double
  ): Boolean = js.native
  def clamp(x: Double, min: Double, max: Double): Double = js.native
  def degreesToRadians(degree: Double): Double = js.native
  def distanceSquared(p1: Point, p2: Point): Double = js.native
  def getCumulativeTransform(element: Element): ICssTransformMatrix = js.native
  def inRange(x: Double, a: Double, b: Double): Boolean = js.native
  def invertMatrix(a: ICssTransformMatrix): ICssTransformMatrix = js.native
  def isNaN(n: js.Any): Boolean = js.native
  def isValidNumber(n: js.Any): Boolean = js.native
  def max[C](array: js.Array[C], defaultValue: C): C = js.native
  def max[T, C](
    array: js.Array[T],
    accessor: js.Function2[/* t */ js.UndefOr[T], /* i */ js.UndefOr[Double], C],
    defaultValue: C
  ): C = js.native
  def min[C](array: js.Array[C], defaultValue: C): C = js.native
  def min[T, C](
    array: js.Array[T],
    accessor: js.Function2[/* t */ js.UndefOr[T], /* i */ js.UndefOr[Double], C],
    defaultValue: C
  ): C = js.native
  def multiplyMatrix(a: ICssTransformMatrix, b: ICssTransformMatrix): ICssTransformMatrix = js.native
  def multiplyTranslate(a: ICssTransformMatrix, v: ITranslateVector): ICssTransformMatrix = js.native
  def premultiplyTranslate(v: ITranslateVector, b: ICssTransformMatrix): ICssTransformMatrix = js.native
  def range(start: Double, stop: Double): js.Array[Double] = js.native
  def range(start: Double, stop: Double, step: Double): js.Array[Double] = js.native
  def within(p: Point, bounds: Bounds): Boolean = js.native
}

