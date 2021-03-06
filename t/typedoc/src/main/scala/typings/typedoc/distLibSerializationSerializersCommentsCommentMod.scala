package typings.typedoc

import org.scalablytyped.runtime.Instantiable2
import typings.typedoc.distLibModelsMod.Comment
import typings.typedoc.distLibSerializationComponentsMod.SerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/comments/comment", JSImport.Namespace)
@js.native
object distLibSerializationSerializersCommentsCommentMod extends js.Object {
  @js.native
  class CommentSerializer () extends SerializerComponent[Comment] {
    @JSName("serializeGroupSymbol")
    var serializeGroupSymbol_CommentSerializer: Instantiable2[js.UndefOr[/* shortText */ String], js.UndefOr[/* text */ String], Comment] = js.native
  }
  
  /* static members */
  @js.native
  object CommentSerializer extends js.Object {
    var PRIORITY: Double = js.native
  }
  
}

