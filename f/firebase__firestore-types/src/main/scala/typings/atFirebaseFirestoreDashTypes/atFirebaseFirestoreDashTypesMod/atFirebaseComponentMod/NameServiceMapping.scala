package typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.atFirebaseComponentMod

import typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.FirebaseFirestore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameServiceMapping extends js.Object {
  var firestore: FirebaseFirestore
}

object NameServiceMapping {
  @scala.inline
  def apply(firestore: FirebaseFirestore): NameServiceMapping = {
    val __obj = js.Dynamic.literal(firestore = firestore.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NameServiceMapping]
  }
}

