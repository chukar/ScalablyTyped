package typings.bitcoinjsDashLib.typesPsbtMod

import typings.bip174.srcLibInterfacesMod.Bip32Derivation
import typings.bip174.srcLibInterfacesMod.FinalScriptSig
import typings.bip174.srcLibInterfacesMod.FinalScriptWitness
import typings.bip174.srcLibInterfacesMod.KeyValue
import typings.bip174.srcLibInterfacesMod.NonWitnessUtxo
import typings.bip174.srcLibInterfacesMod.PartialSig
import typings.bip174.srcLibInterfacesMod.PorCommitment
import typings.bip174.srcLibInterfacesMod.PsbtInput
import typings.bip174.srcLibInterfacesMod.RedeemScript
import typings.bip174.srcLibInterfacesMod.TransactionInput
import typings.bip174.srcLibInterfacesMod.WitnessScript
import typings.bip174.srcLibInterfacesMod.WitnessUtxo
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PsbtInputExtended
  extends PsbtInput
     with TransactionInput

object PsbtInputExtended {
  @scala.inline
  def apply(
    hash: String | Buffer,
    index: Double,
    bip32Derivation: js.Array[Bip32Derivation] = null,
    finalScriptSig: FinalScriptSig = null,
    finalScriptWitness: FinalScriptWitness = null,
    nonWitnessUtxo: NonWitnessUtxo = null,
    partialSig: js.Array[PartialSig] = null,
    porCommitment: PorCommitment = null,
    redeemScript: RedeemScript = null,
    sequence: Int | Double = null,
    sighashType: Int | Double = null,
    unknownKeyVals: js.Array[KeyValue] = null,
    witnessScript: WitnessScript = null,
    witnessUtxo: WitnessUtxo = null
  ): PsbtInputExtended = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    if (bip32Derivation != null) __obj.updateDynamic("bip32Derivation")(bip32Derivation.asInstanceOf[js.Any])
    if (finalScriptSig != null) __obj.updateDynamic("finalScriptSig")(finalScriptSig.asInstanceOf[js.Any])
    if (finalScriptWitness != null) __obj.updateDynamic("finalScriptWitness")(finalScriptWitness.asInstanceOf[js.Any])
    if (nonWitnessUtxo != null) __obj.updateDynamic("nonWitnessUtxo")(nonWitnessUtxo.asInstanceOf[js.Any])
    if (partialSig != null) __obj.updateDynamic("partialSig")(partialSig.asInstanceOf[js.Any])
    if (porCommitment != null) __obj.updateDynamic("porCommitment")(porCommitment.asInstanceOf[js.Any])
    if (redeemScript != null) __obj.updateDynamic("redeemScript")(redeemScript.asInstanceOf[js.Any])
    if (sequence != null) __obj.updateDynamic("sequence")(sequence.asInstanceOf[js.Any])
    if (sighashType != null) __obj.updateDynamic("sighashType")(sighashType.asInstanceOf[js.Any])
    if (unknownKeyVals != null) __obj.updateDynamic("unknownKeyVals")(unknownKeyVals.asInstanceOf[js.Any])
    if (witnessScript != null) __obj.updateDynamic("witnessScript")(witnessScript.asInstanceOf[js.Any])
    if (witnessUtxo != null) __obj.updateDynamic("witnessUtxo")(witnessUtxo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PsbtInputExtended]
  }
}

