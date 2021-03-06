package typings.openlayers.openlayersMod.source

import typings.openlayers.openlayersMod.Attribution
import typings.openlayers.openlayersMod.AttributionLike
import typings.openlayers.openlayersMod.Object
import typings.openlayers.openlayersMod.SourceSourceOptions
import typings.openlayers.openlayersMod.olx.LogoOptions
import typings.openlayers.openlayersMod.proj.Projection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Abstract base class; normally only used for creating subclasses and not
  * instantiated in apps.
  * Base class for {@link ol.layer.Layer} sources.
  *
  * A generic `change` event is triggered when the state of the source changes.
  *
  * @param options Source options.
  * @api stable
  */
@JSImport("openlayers", "source.Source")
@js.native
class Source protected () extends Object {
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for {@link ol.layer.Layer} sources.
    *
    * A generic `change` event is triggered when the state of the source changes.
    *
    * @param options Source options.
    * @api stable
    */
  def this(options: SourceSourceOptions) = this()
  /**
    * Get the attributions of the source.
    * @return Attributions.
    * @api stable
    */
  def getAttributions(): js.Array[Attribution] = js.native
  /**
    * Get the logo of the source.
    * @return Logo.
    * @api stable
    */
  def getLogo(): String | LogoOptions = js.native
  /**
    * Get the projection of the source.
    * @return Projection.
    * @api
    */
  def getProjection(): Projection = js.native
  /**
    * Get the state of the source, see {@link ol.source.State} for possible states.
    * @return State.
    * @api
    */
  def getState(): State = js.native
  /**
    * Refreshes the source and finally dispatches a 'change' event.
    * @api
    */
  def refresh(): Unit = js.native
  /**
    * Set the attributions of the source.
    * @param attributions Attributions.
    *     Can be passed as `string`, `Array<string>`, `{@link ol.Attribution}`,
    *     `Array<{@link ol.Attribution}>` or `undefined`.
    * @api
    */
  def setAttributions(attributions: AttributionLike): Unit = js.native
}

