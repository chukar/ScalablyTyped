package typings.atTensorflowTfjsDashLayers.distModelsMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.serialization.Serializable
import typings.atTensorflowTfjsDashCore.distSerializationMod.ConfigDict
import typings.atTensorflowTfjsDashCore.distSerializationMod.SerializableConstructor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer
import typings.atTensorflowTfjsDashLayers.distEngineTrainingMod.LayersModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/models", "Sequential")
@js.native
class Sequential () extends LayersModel {
  def this(args: SequentialArgs) = this()
  var checkShape: js.Any = js.native
  var model: js.Any = js.native
  /**
    * Adds a layer instance on top of the layer stack.
    *
    * ```js
    *  const model = tf.sequential();
    *  model.add(tf.layers.dense({units: 8, inputShape: [1]}));
    *  model.add(tf.layers.dense({units: 4, activation: 'relu6'}));
    *  model.add(tf.layers.dense({units: 1, activation: 'relu6'}));
    *  // Note that the untrained model is random at this point.
    *  model.predict(tf.randomNormal([10, 1])).print();
    * ```
    * @param layer Layer instance.
    *
    * @exception ValueError In case the `layer` argument does not know its
    * input shape.
    * @exception ValueError In case the `layer` argument has multiple output
    *   tensors, or is already connected somewhere else (forbidden in
    *   `Sequential` models).
    */
  /** @doc {heading: 'Models', subheading: 'Classes'} */
  def add(layer: Layer): Unit = js.native
  def build(): Unit = js.native
  /**
    * Removes the last layer in the model.
    *
    * @exception TypeError if there are no layers in the model.
    */
  def pop(): Unit = js.native
  def predict(x: js.Array[Tensor[Rank]], args: ModelPredictArgs): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  def predict(x: Tensor[Rank], args: ModelPredictArgs): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/models", "Sequential")
@js.native
object Sequential extends js.Object {
  /** @nocollapse */
  var className: String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = js.native
  def fromConfig[T /* <: Serializable */](
    cls: SerializableConstructor[T],
    config: ConfigDict,
    customObjects: ConfigDict,
    fastWeightInit: Boolean
  ): T = js.native
}

