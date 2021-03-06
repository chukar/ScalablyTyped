package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class representing spherical polynomial coefficients to the 3rd degree
  */
@JSGlobal("BABYLON.SphericalPolynomial")
@js.native
class SphericalPolynomial () extends js.Object {
  /**
    * The x coefficients of the spherical polynomial
    */
  var x: Vector3 = js.native
  /**
    * The xx coefficients of the spherical polynomial
    */
  var xx: Vector3 = js.native
  /**
    * The xy coefficients of the spherical polynomial
    */
  var xy: Vector3 = js.native
  /**
    * The y coefficients of the spherical polynomial
    */
  var y: Vector3 = js.native
  /**
    * The yy coefficients of the spherical polynomial
    */
  var yy: Vector3 = js.native
  /**
    * The yz coefficients of the spherical polynomial
    */
  var yz: Vector3 = js.native
  /**
    * The z coefficients of the spherical polynomial
    */
  var z: Vector3 = js.native
  /**
    * The zx coefficients of the spherical polynomial
    */
  var zx: Vector3 = js.native
  /**
    * The zz coefficients of the spherical polynomial
    */
  var zz: Vector3 = js.native
  /**
    * Adds an ambient color to the spherical polynomial
    * @param color the color to add
    */
  def addAmbient(color: Color3): scala.Unit = js.native
  /**
    * Scales the spherical polynomial by the given amount
    * @param scale the amount to scale
    */
  def scale(scale: scala.Double): scala.Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.SphericalPolynomial")
@js.native
object SphericalPolynomial extends js.Object {
  /**
    * Constructs a spherical polynomial from an array.
    * @param data defines the 9x3 coefficients (x, y, z, xx, yy, zz, yz, zx, xy)
    * @returns the spherical polynomial
    */
  def FromArray(data: stdLib.ArrayLike[stdLib.ArrayLike[scala.Double]]): babylonjsLib.BABYLONNs.SphericalPolynomial = js.native
  /**
    * Gets the spherical polynomial from harmonics
    * @param harmonics the spherical harmonics
    * @returns the spherical polynomial
    */
  def FromHarmonics(harmonics: babylonjsLib.BABYLONNs.SphericalHarmonics): babylonjsLib.BABYLONNs.SphericalPolynomial = js.native
}

