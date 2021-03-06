package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.cades.SignaturePolicyIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HashOid extends js.Object {
  var hash: Anon_Alg | SignaturePolicyIdentifier
  var oid: String
}

object Anon_HashOid {
  @scala.inline
  def apply(hash: Anon_Alg | SignaturePolicyIdentifier, oid: String): Anon_HashOid = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_HashOid]
  }
}

