package typings.atNivoSankey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoSankeyMod {
  import typings.react.reactMod.MouseEvent
  import typings.react.reactMod.NativeMouseEvent
  import typings.react.reactMod.ReactNode
  import typings.std.Element

  type AccessorFunc = js.Function1[/* datum */ SankeyNodeDatum, String]
  type LabelFormatter = js.Function1[/* label */ String | Double, String | Double]
  type SankeyMouseHandler = js.Function2[
    /* data */ SankeyNodeDatum | SankeyLinkDatum, 
    /* event */ MouseEvent[Element, NativeMouseEvent], 
    Unit
  ]
  type SankeySortFunction = js.Function2[/* nodeA */ SankeyDataNode, /* nodeB */ SankeyDataNode, Double]
  type TooltipFormat = js.Function1[/* value */ Double, ReactNode]
  type TooltipRenderer[T] = js.Function1[/* data */ T, ReactNode]
}
