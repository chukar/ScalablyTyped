package typings.atAntvG2.atAntvG2Mod

import typings.atAntvG2.Anon_AnimateEnd
import typings.atAntvG2.Anon_AutoSetAxis
import typings.atAntvG2.Anon_Bottom
import typings.atAntvG2.Anon_X
import typings.atAntvG2.atAntvG2Strings.animate
import typings.atAntvG2.atAntvG2Strings.background
import typings.atAntvG2.atAntvG2Strings.container
import typings.atAntvG2.atAntvG2Strings.data
import typings.atAntvG2.atAntvG2Strings.forceFit
import typings.atAntvG2.atAntvG2Strings.height
import typings.atAntvG2.atAntvG2Strings.list
import typings.atAntvG2.atAntvG2Strings.matrix
import typings.atAntvG2.atAntvG2Strings.mirror
import typings.atAntvG2.atAntvG2Strings.padding
import typings.atAntvG2.atAntvG2Strings.pixelRatio
import typings.atAntvG2.atAntvG2Strings.plotBackground
import typings.atAntvG2.atAntvG2Strings.rect
import typings.atAntvG2.atAntvG2Strings.theme
import typings.atAntvG2.atAntvG2Strings.tree
import typings.atAntvG2.atAntvG2Strings.width
import typings.std.HTMLDivElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@antv/g2", "Chart")
@js.native
class Chart protected () extends BashView {
  def this(config: Partial[ChartProps]) = this()
  def changeHeight(height: Double): this.type = js.native
  def changeSize(width: Double, height: Double): this.type = js.native
  def changeWidth(width: Double): this.type = js.native
  def downloadImage(name: String): String = js.native
  @JSName("facet")
  def facet_list(`type`: list, option: Anon_AutoSetAxis): Unit = js.native
  @JSName("facet")
  def facet_matrix(`type`: matrix, option: Anon_AutoSetAxis): Unit = js.native
  @JSName("facet")
  def facet_mirror(`type`: mirror, option: Anon_AutoSetAxis): Unit = js.native
  @JSName("facet")
  def facet_rect(`type`: rect, option: Anon_AutoSetAxis): Unit = js.native
  @JSName("facet")
  def facet_tree(`type`: tree, option: Anon_AutoSetAxis): Unit = js.native
  def forceFit(): this.type = js.native
  def getAllGeoms(): js.Array[Geom] = js.native
  def getSnapRecords(ponit: Anon_X): js.Array[Double] = js.native
  @JSName("get")
  def get_animate(prop: animate): Boolean = js.native
  @JSName("get")
  def get_background(prop: background): typings.atAntvG2.atAntvG2Mod.Styles.background = js.native
  @JSName("get")
  def get_container(prop: container): String | HTMLDivElement = js.native
  @JSName("get")
  def get_data(prop: data): js.Object | js.Any = js.native
  @JSName("get")
  def get_forceFit(prop: forceFit): Boolean = js.native
  @JSName("get")
  def get_height(prop: height): Double = js.native
  @JSName("get")
  def get_padding(prop: padding): Anon_Bottom | Double | String | (js.Tuple4[Double | String, Double | String, Double | String, Double | String]) | (js.Tuple2[String, String]) = js.native
  @JSName("get")
  def get_pixelRatio(prop: pixelRatio): Double = js.native
  @JSName("get")
  def get_plotBackground(prop: plotBackground): typings.atAntvG2.atAntvG2Mod.Styles.background = js.native
  @JSName("get")
  def get_theme(prop: theme): js.Object | String = js.native
  @JSName("get")
  def get_width(prop: width): Double = js.native
  def hideTooltip(): js.Any = js.native
  def legend(field: String, legendConfig: LegendConfig): this.type = js.native
  def legend(field: String, option: Boolean): this.type = js.native
  def legend(option: Boolean): this.type = js.native
  def legend(option: LegendConfig): this.type = js.native
  def on(eventNane: String, event: js.Any): js.Any = js.native
  def render(): Unit = js.native
  def showTooltip(ponit: Anon_X): js.Any = js.native
  def toDataURL(): String = js.native
  def tooltip(tooltipConfig: Boolean): this.type = js.native
  def tooltip(tooltipConfig: TooltipConfig): this.type = js.native
  def view(): View = js.native
  def view(option: Anon_AnimateEnd): View = js.native
}

