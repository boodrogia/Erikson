@0xc037d851bb528efa;

using Java = import "	java.capnp";
$Java.package("org.ericsson2017.protocol.test");
$Java.outerClassname("ResponseClass");

using import "Bugfix.capnp".Bugfix;


struct Response {
    status @0 : Text;
    union {
        bugfix @1 : Bugfix;
        end @2 : Bool;
    } 
}
