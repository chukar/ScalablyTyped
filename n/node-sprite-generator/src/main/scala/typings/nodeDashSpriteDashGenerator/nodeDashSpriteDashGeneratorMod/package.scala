package typings.nodeDashSpriteDashGenerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashSpriteDashGeneratorMod {
  import typings.std.Error

  type LayoutFunc = js.Function3[
    /* images */ js.Array[Image], 
    /* options */ LayoutOption, 
    /* callback */ js.Function2[/* error */ Error, /* layout */ Layout, Unit], 
    Unit
  ]
  type StylesheetFunc = js.Function5[
    /* layout */ Layout, 
    /* stylesheetPath */ String, 
    /* spritePath */ String, 
    /* options */ StylesheetOption, 
    /* callback */ js.Function1[/* error */ Error, Unit], 
    Unit
  ]
}
