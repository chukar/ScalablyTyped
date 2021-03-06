package typings.coinbaseDashCommerceDashNode

import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeMod.CryptoName
import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeMod.PaymentStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Block extends js.Object {
  var block: Anon_Confirmationsaccumulated
  var network: CryptoName
  var status: PaymentStatus
  var transaction_id: String
  var value: Anon_Crypto
}

object Anon_Block {
  @scala.inline
  def apply(
    block: Anon_Confirmationsaccumulated,
    network: CryptoName,
    status: PaymentStatus,
    transaction_id: String,
    value: Anon_Crypto
  ): Anon_Block = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], transaction_id = transaction_id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Block]
  }
}

