package typings.appleDashMapkitDashJs.mapkit

import typings.std.Error
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A geocoder that converts human-readable addresses to geographic coordinates
  * and vice versa.
  */
@JSGlobal("mapkit.Geocoder")
@js.native
/**
  * Initialize a geocoder object and set optional language and user location
  * properties.
  */
class Geocoder () extends js.Object {
  def this(options: GeocoderConstructorOptions) = this()
  /**
    * A Boolean value that indicates whether the geocoder should return results
    * near the user's current location.
    */
  var getsUserLocation: String = js.native
  /**
    * A Boolean value that indicates whether the geocoder should return results
    * near the user's current location.
    */
  var language: String = js.native
  /**
    * Cancels the pending lookup or reverse lookup specified by its request ID.
    *
    * @param id The request ID of the lookup or reverseLookup to cancel.
    */
  def cancel(id: Double): Boolean = js.native
  /**
    * Converts an address to geographic coordinates.
    */
  def lookup(place: String, callback: js.Function2[/* error */ Error | Null, /* data */ GeocoderResponse, Unit]): Double = js.native
  def lookup(
    place: String,
    callback: js.Function2[/* error */ Error | Null, /* data */ GeocoderResponse, Unit],
    options: GeocoderLookupOptions
  ): Double = js.native
  /**
    * Converts a geographic coordinate to an address.
    *
    * @param The coordinate to convert to a human-readable address.
    * @param callback This callback function is invoked with two arguments,
    * error on failure and data on success.
    * @param language language is the only option that can be set for the
    * reverse geocoder.
    */
  def reverseLookup(
    coordinate: Coordinate,
    callback: js.Function2[/* error */ Error | Null, /* data */ GeocoderResponse, Unit]
  ): Double = js.native
  @JSName("reverseLookup")
  def reverseLookup_language(
    coordinate: Coordinate,
    callback: js.Function2[/* error */ Error | Null, /* data */ GeocoderResponse, Unit],
    options: Pick[
      GeocoderConstructorOptions, 
      typings.appleDashMapkitDashJs.appleDashMapkitDashJsStrings.language
    ]
  ): Double = js.native
}

