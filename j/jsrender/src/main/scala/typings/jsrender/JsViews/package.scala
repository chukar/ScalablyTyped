package typings.jsrender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JsViews {
  import org.scalablytyped.runtime.StringDictionary

  // Converters
  type Converter = js.Function2[/* value */ js.Any, /* repeated */ js.Any, js.Any]
  /* Generic hash of objects of type T */
  type Hash[T] = StringDictionary[T]
  type TagRenderMethod = js.Function1[/* repeated */ js.Any, String]
  type TagSetter = TagOptions | String | (js.Function1[/* repeated */ js.Any, js.Any])
  type TemplateSetter = TemplateOptions | String
}
