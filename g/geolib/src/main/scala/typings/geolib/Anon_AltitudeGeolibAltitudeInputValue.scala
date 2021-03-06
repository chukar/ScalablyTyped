package typings.geolib

import typings.geolib.esTypesMod.GeolibAltitudeInputValue
import typings.geolib.esTypesMod.GeolibInputAltitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltitudeGeolibAltitudeInputValue extends GeolibInputAltitude {
  var altitude: js.UndefOr[GeolibAltitudeInputValue] = js.undefined
}

object Anon_AltitudeGeolibAltitudeInputValue {
  @scala.inline
  def apply(altitude: Int | Double = null): Anon_AltitudeGeolibAltitudeInputValue = {
    val __obj = js.Dynamic.literal()
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AltitudeGeolibAltitudeInputValue]
  }
}

