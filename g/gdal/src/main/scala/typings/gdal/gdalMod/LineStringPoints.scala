package typings.gdal.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineStringPoints extends js.Object {
  def add(point: js.Array[Point]): Unit = js.native
  def add(point: Point): Unit = js.native
  def count(): Double = js.native
  def forEach(callback: js.Function2[/* point */ Point, /* i */ Double, Unit]): Unit = js.native
  def get(index: Double): Point = js.native
  def map[T](callback: js.Function2[/* point */ Point, /* i */ Double, T]): js.Array[T] = js.native
  def remove(index: Double): Unit = js.native
  def resize(count: Double): Unit = js.native
  def reverse(): Unit = js.native
  def set(index: Double, point: Point): Unit = js.native
  def toArray(): js.Array[Point] = js.native
}

