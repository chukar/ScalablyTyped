package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Applies a kernel filter to the image
  */
@JSImport("babylonjs", "FilterPostProcess")
@js.native
class FilterPostProcess protected ()
  extends babylonjsLib.BABYLONNs.FilterPostProcess {
  def this(name: java.lang.String, /** The matrix to be applied to the image */
  kernelMatrix: babylonjsLib.BABYLONNs.Matrix, options: babylonjsLib.BABYLONNs.PostProcessOptions, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera]) = this()
  /**
    *
    * @param name The name of the effect.
    * @param kernelMatrix The matrix to be applied to the image
    * @param options The required width/height ratio to downsize to before computing the render pass.
    * @param camera The camera to apply the render pass to.
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    */
  def this(name: java.lang.String, /** The matrix to be applied to the image */
  kernelMatrix: babylonjsLib.BABYLONNs.Matrix, options: scala.Double, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera]) = this()
  def this(name: java.lang.String, /** The matrix to be applied to the image */
  kernelMatrix: babylonjsLib.BABYLONNs.Matrix, options: babylonjsLib.BABYLONNs.PostProcessOptions, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double) = this()
  def this(name: java.lang.String, /** The matrix to be applied to the image */
  kernelMatrix: babylonjsLib.BABYLONNs.Matrix, options: scala.Double, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double) = this()
  def this(name: java.lang.String, /** The matrix to be applied to the image */
  kernelMatrix: babylonjsLib.BABYLONNs.Matrix, options: babylonjsLib.BABYLONNs.PostProcessOptions, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine) = this()
  def this(name: java.lang.String, /** The matrix to be applied to the image */
  kernelMatrix: babylonjsLib.BABYLONNs.Matrix, options: scala.Double, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine) = this()
  def this(name: java.lang.String, /** The matrix to be applied to the image */
  kernelMatrix: babylonjsLib.BABYLONNs.Matrix, options: babylonjsLib.BABYLONNs.PostProcessOptions, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine, reusable: scala.Boolean) = this()
  def this(name: java.lang.String, /** The matrix to be applied to the image */
  kernelMatrix: babylonjsLib.BABYLONNs.Matrix, options: scala.Double, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine, reusable: scala.Boolean) = this()
}

