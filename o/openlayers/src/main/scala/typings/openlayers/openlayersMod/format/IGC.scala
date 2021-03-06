package typings.openlayers.openlayersMod.format

import typings.openlayers.openlayersMod.GlobalObject
import typings.openlayers.openlayersMod.olx.format.IGCOptions
import typings.openlayers.openlayersMod.olx.format.ReadOptions
import typings.openlayers.openlayersMod.proj.Projection
import typings.std.Document
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Feature format for `*.igc` flight recording files.
  *
  * @param opt_options Options.
  * @api
  */
@JSImport("openlayers", "format.IGC")
@js.native
/**
  * @classdesc
  * Feature format for `*.igc` flight recording files.
  *
  * @param opt_options Options.
  * @api
  */
class IGC () extends TextFeature {
  def this(opt_options: IGCOptions) = this()
  def readFeature(source: String): typings.openlayers.openlayersMod.Feature = js.native
  def readFeature(source: String, opt_options: ReadOptions): typings.openlayers.openlayersMod.Feature = js.native
  def readFeature(source: GlobalObject): typings.openlayers.openlayersMod.Feature = js.native
  def readFeature(source: GlobalObject, opt_options: ReadOptions): typings.openlayers.openlayersMod.Feature = js.native
  /**
    * Read the feature from the IGC source.
    *
    * @param source Source.
    * @param opt_options Read options.
    * @return Feature.
    * @api
    */
  def readFeature(source: Document): typings.openlayers.openlayersMod.Feature = js.native
  def readFeature(source: Document, opt_options: ReadOptions): typings.openlayers.openlayersMod.Feature = js.native
  def readFeature(source: Node): typings.openlayers.openlayersMod.Feature = js.native
  def readFeature(source: Node, opt_options: ReadOptions): typings.openlayers.openlayersMod.Feature = js.native
  def readFeatures(source: String): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
  def readFeatures(source: String, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
  def readFeatures(source: GlobalObject): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
  def readFeatures(source: GlobalObject, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
  /**
    * Read the feature from the source. As IGC sources contain a single
    * feature, this will return the feature in an array.
    *
    * @param source Source.
    * @param opt_options Read options.
    * @return Features.
    * @api
    */
  def readFeatures(source: Document): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
  def readFeatures(source: Document, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
  def readFeatures(source: Node): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
  def readFeatures(source: Node, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
  def readProjection(source: String): Projection = js.native
  def readProjection(source: GlobalObject): Projection = js.native
  /**
    * Read the projection from the IGC source.
    *
    * @param source Source.
    * @return Projection.
    * @api
    */
  def readProjection(source: Document): Projection = js.native
  def readProjection(source: Node): Projection = js.native
}

