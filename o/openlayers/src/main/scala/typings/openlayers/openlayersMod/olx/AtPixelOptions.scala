package typings.openlayers.openlayersMod.olx

import typings.openlayers.openlayersMod.layer.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object literal with options for the {@link ol.Map#forEachFeatureAtPixel} and
  * {@link ol.Map#hasFeatureAtPixel} methods.
  */
trait AtPixelOptions extends js.Object {
  var hitTolerance: js.UndefOr[Double] = js.undefined
  var layerFilter: js.UndefOr[js.Function1[/* layer */ Layer, Boolean]] = js.undefined
}

object AtPixelOptions {
  @scala.inline
  def apply(hitTolerance: Int | Double = null, layerFilter: /* layer */ Layer => Boolean = null): AtPixelOptions = {
    val __obj = js.Dynamic.literal()
    if (hitTolerance != null) __obj.updateDynamic("hitTolerance")(hitTolerance.asInstanceOf[js.Any])
    if (layerFilter != null) __obj.updateDynamic("layerFilter")(js.Any.fromFunction1(layerFilter))
    __obj.asInstanceOf[AtPixelOptions]
  }
}

