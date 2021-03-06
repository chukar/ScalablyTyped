package typings.gulpDashInject

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gulpDashInjectMod {
  import typings.vinyl.vinylMod.File

  type ITagFunction = js.Function2[/* targetExt */ String, /* sourceExt */ String, String]
  type ITransformFunction = js.Function5[
    /* filepath */ String, 
    /* file */ js.UndefOr[File], 
    /* index */ js.UndefOr[Double], 
    /* length */ js.UndefOr[Double], 
    /* targetFile */ js.UndefOr[File], 
    String
  ]
}
