package typings.prismaDashBinding

import typings.apolloDashLink.apolloDashLinkMod.ApolloLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prisma-binding/dist/SharedLink", JSImport.Namespace)
@js.native
object distSharedLinkMod extends js.Object {
  @js.native
  class SharedLink () extends ApolloLink {
    var innerLink: js.UndefOr[js.Any] = js.native
    def setInnerLink(innerLink: ApolloLink): Unit = js.native
  }
  
}

