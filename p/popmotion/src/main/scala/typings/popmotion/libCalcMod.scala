package typings.popmotion

import typings.atPopmotionPopcorn.Anon_X
import typings.atPopmotionPopcorn.libTypesMod.Point
import typings.atPopmotionPopcorn.libTypesMod.Point2D
import typings.atPopmotionPopcorn.libUtilsDistanceMod._Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/calc", JSImport.Namespace)
@js.native
object libCalcMod extends js.Object {
  def angle(a: Point): Double = js.native
  def angle(a: Point, b: Point): Double = js.native
  def degreesToRadians(degrees: Double): Double = js.native
  def dilate(from: Double, to: Double, progress: Double): Double = js.native
  def distance(a: _Point): Double = js.native
  def distance(a: _Point, b: _Point): Double = js.native
  def getProgressFromValue(from: Double, to: Double, value: Double): Double = js.native
  def getValueFromProgress(from: Double, to: Double, progress: Double): Double = js.native
  def isPoint(point: js.Object): /* is @popmotion/popcorn.@popmotion/popcorn/lib/types.Point */ Boolean = js.native
  def isPoint3D(point: Point): /* is @popmotion/popcorn.@popmotion/popcorn/lib/types.Point3D */ Boolean = js.native
  def pointFromAngleAndDistance(origin: Point2D, angle: Double, distance: Double): Anon_X = js.native
  def radiansToDegrees(radians: Double): Double = js.native
  def smooth(prevValue: Double, nextValue: Double, duration: Double): Double = js.native
  def smooth(prevValue: Double, nextValue: Double, duration: Double, smoothing: Double): Double = js.native
  def speedPerFrame(xps: Double, frameDuration: Double): Double = js.native
  def speedPerSecond(velocity: Double, frameDuration: Double): Double = js.native
  def stepProgress(steps: Double, progress: Double): Double = js.native
}

