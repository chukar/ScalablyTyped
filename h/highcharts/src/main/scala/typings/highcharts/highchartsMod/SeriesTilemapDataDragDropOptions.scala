package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesTilemapDataDragDropOptions extends js.Object {
  /**
    * (Highcharts, Highmaps) Options for the drag handles.
    */
  var dragHandle: js.UndefOr[SeriesTilemapDataDragDropDragHandleOptions] = js.undefined
  /**
    * (Highcharts, Highmaps) Set the maximum X value the points can be moved
    * to.
    */
  var dragMaxX: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highmaps) Set the maximum Y value the points can be moved
    * to.
    */
  var dragMaxY: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highmaps) Set the minimum X value the points can be moved
    * to.
    */
  var dragMinX: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highmaps) Set the minimum Y value the points can be moved
    * to.
    */
  var dragMinY: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highmaps) The X precision value to drag to for this series.
    * Set to 0 to disable. By default this is disabled, except for category
    * axes, where the default is 1.
    */
  var dragPrecisionX: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highmaps) The Y precision value to drag to for this series.
    * Set to 0 to disable. By default this is disabled, except for category
    * axes, where the default is 1.
    */
  var dragPrecisionY: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highmaps) The amount of pixels to drag the pointer before it
    * counts as a drag operation. This prevents drag/drop to fire when just
    * clicking or selecting points.
    */
  var dragSensitivity: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highmaps) Enable dragging in the X dimension.
    */
  var draggableX: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highmaps) Enable dragging in the Y dimension. Note that this
    * is not supported for TreeGrid axes (the default axis type in Gantt
    * charts).
    */
  var draggableY: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highmaps) Group the points by a property. Points with the
    * same property value will be grouped together when moving.
    */
  var groupBy: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highmaps) Style options for the guide box. The guide box has
    * one state by default, the `default` state.
    */
  var guideBox: js.UndefOr[
    SeriesTilemapDataDragDropGuideBoxOptions | Dictionary[PlotSeriesDragDropGuideBoxDefaultOptions]
  ] = js.undefined
  /**
    * (Highcharts, Highmaps) Update points as they are dragged. If false, a
    * guide box is drawn to illustrate the new point size.
    */
  var liveRedraw: js.UndefOr[Boolean] = js.undefined
}

object SeriesTilemapDataDragDropOptions {
  @scala.inline
  def apply(
    dragHandle: SeriesTilemapDataDragDropDragHandleOptions = null,
    dragMaxX: Int | Double = null,
    dragMaxY: Int | Double = null,
    dragMinX: Int | Double = null,
    dragMinY: Int | Double = null,
    dragPrecisionX: Int | Double = null,
    dragPrecisionY: Int | Double = null,
    dragSensitivity: Int | Double = null,
    draggableX: js.UndefOr[Boolean] = js.undefined,
    draggableY: js.UndefOr[Boolean] = js.undefined,
    groupBy: String = null,
    guideBox: SeriesTilemapDataDragDropGuideBoxOptions | Dictionary[PlotSeriesDragDropGuideBoxDefaultOptions] = null,
    liveRedraw: js.UndefOr[Boolean] = js.undefined
  ): SeriesTilemapDataDragDropOptions = {
    val __obj = js.Dynamic.literal()
    if (dragHandle != null) __obj.updateDynamic("dragHandle")(dragHandle.asInstanceOf[js.Any])
    if (dragMaxX != null) __obj.updateDynamic("dragMaxX")(dragMaxX.asInstanceOf[js.Any])
    if (dragMaxY != null) __obj.updateDynamic("dragMaxY")(dragMaxY.asInstanceOf[js.Any])
    if (dragMinX != null) __obj.updateDynamic("dragMinX")(dragMinX.asInstanceOf[js.Any])
    if (dragMinY != null) __obj.updateDynamic("dragMinY")(dragMinY.asInstanceOf[js.Any])
    if (dragPrecisionX != null) __obj.updateDynamic("dragPrecisionX")(dragPrecisionX.asInstanceOf[js.Any])
    if (dragPrecisionY != null) __obj.updateDynamic("dragPrecisionY")(dragPrecisionY.asInstanceOf[js.Any])
    if (dragSensitivity != null) __obj.updateDynamic("dragSensitivity")(dragSensitivity.asInstanceOf[js.Any])
    if (!js.isUndefined(draggableX)) __obj.updateDynamic("draggableX")(draggableX.asInstanceOf[js.Any])
    if (!js.isUndefined(draggableY)) __obj.updateDynamic("draggableY")(draggableY.asInstanceOf[js.Any])
    if (groupBy != null) __obj.updateDynamic("groupBy")(groupBy.asInstanceOf[js.Any])
    if (guideBox != null) __obj.updateDynamic("guideBox")(guideBox.asInstanceOf[js.Any])
    if (!js.isUndefined(liveRedraw)) __obj.updateDynamic("liveRedraw")(liveRedraw.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesTilemapDataDragDropOptions]
  }
}

