package typings.ol.controlOverviewMapMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var collapseLabel: js.UndefOr[String | HTMLElement] = js.undefined
  var collapsed: js.UndefOr[Boolean] = js.undefined
  var collapsible: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String | HTMLElement] = js.undefined
  var layers: js.UndefOr[
    js.Array[typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]] | typings.ol.collectionMod.default[typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]]
  ] = js.undefined
  var render: js.UndefOr[js.Function1[/* p0 */ typings.ol.mapEventMod.default, Unit]] = js.undefined
  var rotateWithView: js.UndefOr[Boolean] = js.undefined
  var target: js.UndefOr[HTMLElement | String] = js.undefined
  var tipLabel: js.UndefOr[String] = js.undefined
  var view: js.UndefOr[typings.ol.viewMod.default] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    className: String = null,
    collapseLabel: String | HTMLElement = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    collapsible: js.UndefOr[Boolean] = js.undefined,
    label: String | HTMLElement = null,
    layers: js.Array[typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]] | typings.ol.collectionMod.default[typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]] = null,
    render: /* p0 */ typings.ol.mapEventMod.default => Unit = null,
    rotateWithView: js.UndefOr[Boolean] = js.undefined,
    target: HTMLElement | String = null,
    tipLabel: String = null,
    view: typings.ol.viewMod.default = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (collapseLabel != null) __obj.updateDynamic("collapseLabel")(collapseLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (!js.isUndefined(rotateWithView)) __obj.updateDynamic("rotateWithView")(rotateWithView.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (tipLabel != null) __obj.updateDynamic("tipLabel")(tipLabel.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

