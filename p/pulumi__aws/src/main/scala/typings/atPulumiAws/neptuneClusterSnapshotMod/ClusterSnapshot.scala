package typings.atPulumiAws.neptuneClusterSnapshotMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/neptune/clusterSnapshot", "ClusterSnapshot")
@js.native
class ClusterSnapshot protected () extends CustomResource {
  /**
    * Create a ClusterSnapshot resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ClusterSnapshotArgs) = this()
  def this(name: String, args: ClusterSnapshotArgs, opts: CustomResourceOptions) = this()
  /**
    * Specifies the allocated storage size in gigabytes (GB).
    */
  val allocatedStorage: Output[Double] = js.native
  /**
    * List of EC2 Availability Zones that instances in the DB cluster snapshot can be restored in.
    */
  val availabilityZones: Output[js.Array[String]] = js.native
  /**
    * The DB Cluster Identifier from which to take the snapshot.
    */
  val dbClusterIdentifier: Output[String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the DB Cluster Snapshot.
    */
  val dbClusterSnapshotArn: Output[String] = js.native
  /**
    * The Identifier for the snapshot.
    */
  val dbClusterSnapshotIdentifier: Output[String] = js.native
  /**
    * Specifies the name of the database engine.
    */
  val engine: Output[String] = js.native
  /**
    * Version of the database engine for this DB cluster snapshot.
    */
  val engineVersion: Output[String] = js.native
  /**
    * If storageEncrypted is true, the AWS KMS key identifier for the encrypted DB cluster snapshot.
    */
  val kmsKeyId: Output[String] = js.native
  /**
    * License model information for the restored DB cluster.
    */
  val licenseModel: Output[String] = js.native
  /**
    * Port that the DB cluster was listening on at the time of the snapshot.
    */
  val port: Output[Double] = js.native
  val snapshotType: Output[String] = js.native
  val sourceDbClusterSnapshotArn: Output[String] = js.native
  /**
    * The status of this DB Cluster Snapshot.
    */
  val status: Output[String] = js.native
  /**
    * Specifies whether the DB cluster snapshot is encrypted.
    */
  val storageEncrypted: Output[Boolean] = js.native
  /**
    * The VPC ID associated with the DB cluster snapshot.
    */
  val vpcId: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/neptune/clusterSnapshot", "ClusterSnapshot")
@js.native
object ClusterSnapshot extends js.Object {
  /**
    * Get an existing ClusterSnapshot resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): ClusterSnapshot = js.native
  def get(name: String, id: Input[ID], state: ClusterSnapshotState): ClusterSnapshot = js.native
  def get(name: String, id: Input[ID], state: ClusterSnapshotState, opts: CustomResourceOptions): ClusterSnapshot = js.native
  /**
    * Returns true if the given object is an instance of ClusterSnapshot.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/neptune/clusterSnapshot.ClusterSnapshot */ Boolean = js.native
}

