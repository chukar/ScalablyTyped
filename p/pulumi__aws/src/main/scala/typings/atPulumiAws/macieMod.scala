package typings.atPulumiAws

import typings.atPulumiAws.macieMemberAccountAssociationMod.MemberAccountAssociationArgs
import typings.atPulumiAws.macieMemberAccountAssociationMod.MemberAccountAssociationState
import typings.atPulumiAws.macieS3BucketAssociationMod.S3BucketAssociationArgs
import typings.atPulumiAws.macieS3BucketAssociationMod.S3BucketAssociationState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/macie", JSImport.Namespace)
@js.native
object macieMod extends js.Object {
  @js.native
  class MemberAccountAssociation protected ()
    extends typings.atPulumiAws.macieMemberAccountAssociationMod.MemberAccountAssociation {
    /**
      * Create a MemberAccountAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MemberAccountAssociationArgs) = this()
    def this(name: String, args: MemberAccountAssociationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class S3BucketAssociation protected ()
    extends typings.atPulumiAws.macieS3BucketAssociationMod.S3BucketAssociation {
    /**
      * Create a S3BucketAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: S3BucketAssociationArgs) = this()
    def this(name: String, args: S3BucketAssociationArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object MemberAccountAssociation extends js.Object {
    /**
      * Get an existing MemberAccountAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.macieMemberAccountAssociationMod.MemberAccountAssociation = js.native
    def get(name: String, id: Input[ID], state: MemberAccountAssociationState): typings.atPulumiAws.macieMemberAccountAssociationMod.MemberAccountAssociation = js.native
    def get(name: String, id: Input[ID], state: MemberAccountAssociationState, opts: CustomResourceOptions): typings.atPulumiAws.macieMemberAccountAssociationMod.MemberAccountAssociation = js.native
    /**
      * Returns true if the given object is an instance of MemberAccountAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/macie/memberAccountAssociation.MemberAccountAssociation */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object S3BucketAssociation extends js.Object {
    /**
      * Get an existing S3BucketAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.macieS3BucketAssociationMod.S3BucketAssociation = js.native
    def get(name: String, id: Input[ID], state: S3BucketAssociationState): typings.atPulumiAws.macieS3BucketAssociationMod.S3BucketAssociation = js.native
    def get(name: String, id: Input[ID], state: S3BucketAssociationState, opts: CustomResourceOptions): typings.atPulumiAws.macieS3BucketAssociationMod.S3BucketAssociation = js.native
    /**
      * Returns true if the given object is an instance of S3BucketAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/macie/s3BucketAssociation.S3BucketAssociation */ Boolean = js.native
  }
  
}

