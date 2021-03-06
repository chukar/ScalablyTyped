package typings.divaDotJs

import typings.divaDotJs.interfacesMod.Dimensions
import typings.divaDotJs.interfacesMod.Offset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColDimensions extends js.Object {
  var col: Double
  var dimensions: Dimensions
  var offset: Offset
  var row: Double
  var url: String
  var zoomLevel: Double
}

object Anon_ColDimensions {
  @scala.inline
  def apply(col: Double, dimensions: Dimensions, offset: Offset, row: Double, url: String, zoomLevel: Double): Anon_ColDimensions = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], zoomLevel = zoomLevel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ColDimensions]
  }
}

