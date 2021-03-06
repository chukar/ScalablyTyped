package typings.tsDashMockito

import typings.tsDashMockito.libMatcherTypeMatcherMod.Matcher
import typings.tsDashMockito.libStubAbstractMethodStubMod.AbstractMethodStub
import typings.tsDashMockito.libStubMethodStubMod.MethodStub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-mockito/lib/stub/RejectPromiseMethodStub", JSImport.Namespace)
@js.native
object libStubRejectPromiseMethodStubMod extends js.Object {
  @js.native
  class RejectPromiseMethodStub protected ()
    extends AbstractMethodStub
       with MethodStub {
    def this(groupIndex: Double, matchers: js.Array[Matcher], value: js.Any) = this()
    var matchers: js.Any = js.native
    var validator: js.Any = js.native
    var value: js.Any = js.native
    /* CompleteClass */
    override def execute(args: js.Array[_]): Unit = js.native
    /* InferMemberOverrides */
    override def getGroupIndex(): Double = js.native
    /* CompleteClass */
    override def getValue(): js.Any = js.native
    /* CompleteClass */
    override def isApplicable(args: js.Array[_]): Boolean = js.native
  }
  
}

