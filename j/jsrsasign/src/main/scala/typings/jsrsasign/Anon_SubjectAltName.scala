package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.ArrayParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SubjectAltName extends js.Object {
  var subjectAltName: ArrayParam[Anon_Dns]
}

object Anon_SubjectAltName {
  @scala.inline
  def apply(subjectAltName: ArrayParam[Anon_Dns]): Anon_SubjectAltName = {
    val __obj = js.Dynamic.literal(subjectAltName = subjectAltName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_SubjectAltName]
  }
}

