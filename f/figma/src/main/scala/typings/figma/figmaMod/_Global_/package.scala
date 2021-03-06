package typings.figma.figmaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object _Global_ {
  type MessageEventHandler = js.Function2[/* pluginMessage */ js.Any, /* props */ OnMessageProperties, Unit]
  ////////////////////////////////////////////////////////////////////////////////
  // Datatypes
  type Transform = js.Tuple2[js.Tuple3[Double, Double, Double], js.Tuple3[Double, Double, Double]]
  type VectorPaths = js.Array[VectorPath]
}
