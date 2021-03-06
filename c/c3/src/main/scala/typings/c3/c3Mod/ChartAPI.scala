package typings.c3.c3Mod

import org.scalablytyped.runtime.StringDictionary
import typings.c3.Anon_Add
import typings.c3.Anon_Axes
import typings.c3.Anon_AxesColors
import typings.c3.Anon_Columns
import typings.c3.Anon_Domain
import typings.c3.Anon_Height
import typings.c3.Anon_Hide
import typings.c3.Anon_KeyLabels
import typings.c3.Anon_WithLegend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartAPI extends js.Object {
  var axis: Anon_KeyLabels = js.native
  @JSName("data")
  var data_Original: Anon_AxesColors = js.native
  var legend: Anon_Hide = js.native
  @JSName("regions")
  var regions_Original: Anon_Add = js.native
  @JSName("xgrids")
  var xgrids_Original: GridOperations = js.native
  @JSName("ygrids")
  var ygrids_Original: GridOperations = js.native
  @JSName("zoom")
  var zoom_Original: Anon_Domain = js.native
  /**
    * Get and set the categories
    * @param categories: Value of the categories to update
    */
  def categories(): js.Array[String] = js.native
  def categories(categories: js.Array[String]): js.Array[String] = js.native
  /**
    * Gets and sets the value a category
    * @param index Index of the category to get or set
    * @param category: Value of the category to update
    */
  def category(index: Double): String = js.native
  def category(index: Double, category: String): String = js.native
  /**
    * Get the color for the specified targetId
    */
  def color(targetId: String): String = js.native
  /**
    * Get data loaded in the chart.
    * @param targetIds If this argument is given, this API returns the specified target data. If this argument is not given, all of data will be returned.
    */
  def data(): Data = js.native
  def data(targetIds: ArrayOrString): Data = js.native
  /**
    * This API fades out specified targets and reverts the others.
    * You can specify multiple targets by giving an array that includes id as String. If no argument is given, all of targets will be faded out.
    */
  def defocus(): Unit = js.native
  def defocus(targetIds: ArrayOrString): Unit = js.native
  /**
    * Reset the chart object and remove element and events completely.
    */
  def destroy(): Unit = js.native
  /**
    * Flow data to the chart. By this API, you can append new data points to the chart.
    * If json, rows and columns given, the data will be loaded. If data that has the same target id is given, the chart will be appended. Otherwise, new target will be added. One of these is
    * required when calling. If json specified, keys is required as well as data.json
    * If to is given, the lower x edge will move to that point. If not given, the lower x edge will move by the number of given data points.
    * If length is given, the lower x edge will move by the number of this argument.
    * If duration is given, the duration of the transition will be specified value. If not given, transition.duration will be used as default.
    * If done is given, the specified function will be called when flow ends.
    */
  def flow(args: Anon_Columns): Unit = js.native
  /**
    * Force to redraw.
    */
  def flush(): Unit = js.native
  /**
    * This API highlights specified targets and fade out the others.
    * You can specify multiple targets by giving an array that includes id as String. If no argument is given, all of targets will be highlighted.
    */
  def focus(): Unit = js.native
  def focus(targetIds: ArrayOrString): Unit = js.native
  /**
    * Update groups for the targets.
    * @param groups This argument needs to be an Array that includes one or more Array that includes target ids to be grouped.
    */
  def groups(groups: js.Array[js.Array[String]]): Unit = js.native
  /**
    * This API hides specified targets.
    * You can specify multiple targets by giving an array that includes id as String. If no argument is given, all of targets will be hidden.
    * If withLegend is set true, legend will be hidden together with the specified data.
    */
  def hide(): Unit = js.native
  def hide(targetIds: ArrayOrString): Unit = js.native
  def hide(targetIds: ArrayOrString, options: Anon_WithLegend): Unit = js.native
  /**
    * Load data to the chart.
    * If url, json, rows and columns given, the data will be loaded. If data that has the same target id is given, the chart will be updated. Otherwise, new target will be added.
    * If classes given, the classes specifed by data.classes will be updated. classes must be Object that has target id as keys.
    * If categories given, the categories specifed by axis.x.categories or data.x will be updated. categories must be Array.
    * If axes given, the axes specifed by data.axes will be updated. axes must be Object that has target id as keys.
    * If colors given, the colors specifed by data.colors will be updated. colors must be Object that has target id as keys.
    * If type or types given, the type of targets will be updated. type must be String and types must be Object.
    * If unload given, data will be unloaded before loading new data. If true given, all of data will be unloaded. If target ids given as String or Array, specified targets will be unloaded.
    * If done given, the specified function will be called after data loded.
    * NOTE: unload should be used if some data needs to be unloaded simultaneously. If you call unload API soon after/before load instead of unload param, chart will not be rendered properly
    * because of cancel of animation.
    * NOTE: done will be called after data loaded, but it's not after rendering. It's because rendering will finish after some transition and there is some time lag between loading and rendering.
    */
  def load(args: Anon_Axes): Unit = js.native
  /**
    * Update regions.
    * @param regions Regions will be replaced with this argument. The format of this argument is the same as regions.
    */
  def regions(regions: js.Array[_]): Unit = js.native
  /**
    * Resize the chart. If no size is specified it will resize to fit.
    * @param size This argument should include width and height in pixels.
    */
  def resize(): Unit = js.native
  def resize(size: Anon_Height): Unit = js.native
  /**
    * This API reverts specified targets.
    * You can specify multiple targets by giving an array that includes id as String. If no argument is given, all of targets will be reverted.
    */
  def revert(): Unit = js.native
  def revert(targetIds: ArrayOrString): Unit = js.native
  /**
    * Change data point state to selected. By this API, you can select data points. To use this API, data.selection.enabled needs to be set true.
    * @param ids Specify target ids to be selected. If this argument is not given, all targets will be the candidate.
    * @param indices Specify indices to be selected. If this argument is not given, all data points will be the candidate.
    * @param resetOthers If this argument is set true, the data points that are not specified by ids, indices will be unselected.
    */
  def select(): Unit = js.native
  def select(ids: js.Array[String]): Unit = js.native
  def select(ids: js.Array[String], indices: js.Array[Double]): Unit = js.native
  def select(ids: js.Array[String], indices: js.Array[Double], resetOthers: Boolean): Unit = js.native
  /**
    * Get selected data points. By this API, you can get selected data points information. To use this API, data.selection.enabled needs to be set true.
    * @param targetId You can filter the result by giving target id that you want to get. If not given, all of data points will be returned.
    */
  def selected(): Data = js.native
  def selected(targetId: String): Data = js.native
  /**
    * This API shows specified targets.
    * You can specify multiple targets by giving an array that includes id as String. If no argument is given, all of targets will be shown.
    * If withLegend is set true, legend will be shown together with the specified data.
    */
  def show(): Unit = js.native
  def show(targetIds: ArrayOrString): Unit = js.native
  def show(targetIds: ArrayOrString, options: Anon_WithLegend): Unit = js.native
  /**
    * This API toggles (shows or hides) specified targets.
    * You can specify multiple targets by giving an array that includes id as String. If no argument is given, all of targets will be toggles.
    * If withLegend is set true, legend will be toggled together with the specified data.
    */
  def toggle(): Unit = js.native
  def toggle(targetIds: ArrayOrString): Unit = js.native
  def toggle(targetIds: ArrayOrString, options: Anon_WithLegend): Unit = js.native
  /**
    * Change the type of the chart.
    * @param type Specify the type to be transformed. The types listed in data.type can be used.
    * @param targetIds Specify targets to be transformed. If not given, all targets will be the candidate.
    */
  def transform(`type`: String): Unit = js.native
  def transform(`type`: String, targetIds: ArrayOrString): Unit = js.native
  /**
    * Unload data to the chart.
    * You can specify multiple targets by giving an array that includes id as String. If no argument is given, all of targets will be toggles.
    * If ids given, the data that has specified target id will be unloaded. ids should be String or Array. If ids is not specified, all data will be unloaded.
    * If done given, the specified function will be called after data loded.
    * NOTE: If you call load API soon after/before unload, unload param of load should be used. Otherwise chart will not be rendered properly because of cancel of animation.
    * NOTE: done will be called after data loaded, but it's not after rendering. It's because rendering will finish after some transition and there is some time lag between loading and rendering.
    */
  def unload(): js.Any = js.native
  def unload(targetIds: TargetIds): js.Any = js.native
  def unload(targetIds: TargetIds, done: js.Function0[_]): js.Any = js.native
  /**
    * Change data point state to unselected. By this API, you can unselect data points. To use this API, data.selection.enabled needs to be set true.
    * @param ids Specify target ids to be unselected. If this argument is not given, all targets will be the candidate.
    * @param indices Specify indices to be unselected. If this argument is not given, all data points will be the candidate.
    */
  def unselect(): Unit = js.native
  def unselect(ids: js.Array[String]): Unit = js.native
  def unselect(ids: js.Array[String], indices: js.Array[Double]): Unit = js.native
  /**
    * Unzoom to the original domain.
    */
  def unzoom(): Unit = js.native
  /**
    * Get and set x values for the chart.
    * @param x If x is given, x values of every target will be updated. If no argument is given, current x values will be returned as an Object whose keys are the target ids.
    */
  def x(): PrimitiveArray = js.native
  def x(x: PrimitiveArray): PrimitiveArray = js.native
  /**
    * Update the x/y grid lines.
    * @param grids X/Y grid lines will be replaced with this argument. The format of this argument is the same as grid.x.lines or grid.y.lines.
    */
  def xgrids(grids: js.Array[_]): Unit = js.native
  /**
    * Get and set x values for the chart.
    * @param x If x is given, x values of every target will be updated. If no argument is given, current x values will be returned as an Object whose keys are the target ids.
    */
  def xs(): StringDictionary[PrimitiveArray] = js.native
  def xs(xs: StringDictionary[PrimitiveArray]): StringDictionary[PrimitiveArray] = js.native
  /**
    * Update the x/y grid lines.
    * @param grids X/Y grid lines will be replaced with this argument. The format of this argument is the same as grid.x.lines or grid.y.lines.
    */
  def ygrids(grids: js.Array[_]): Unit = js.native
  /**
    * Zoom by giving x domain.
    * @param domain If domain is given, the chart will be zoomed to the given domain. If no argument is given, the current zoomed domain will be returned.
    */
  def zoom(): js.Array[Double] = js.native
  def zoom(domain: js.Array[Double]): js.Array[Double] = js.native
}

