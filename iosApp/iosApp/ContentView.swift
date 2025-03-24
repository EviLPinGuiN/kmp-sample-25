import SwiftUI
import shared

struct ContentView: View {
	let greet = Greeting().greet()

	var body: some View {
        Text(greet).onTapGesture {
            
        }
	}
    
    // sealed interface
    func handleAction(action: MainAction) {
        switch action {
        case _ as MainAction.CloseScreen:
            print("MainAction.CloseScreen")
        case let action as MainAction.ShowMessage:
            print("ShowMessage: \(action.message) \(action.description_)")
        default:
            print("default")
            break
        }
    }
    
    // sealed interface
    func handleAction(action: MainAction2) {
        switch action {
        case _ as MainAction2CloseScreen:
            print("MainAction.CloseScreen")
        case let action as MainAction2ShowMessage:
            print("ShowMessage: \(action.message) \(action.description_)")
        default:
            print("default")
            break
        }
    }
}

#Preview("1") {
    ContentView()
}

#Preview("2") {
    ContentView()
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}


class TEST {
    
    
    //    fun test(name: String): String {
    //        return "test"
    //    }
    
//    func main() {
//        let array = [""]
//        
//        var array2 = ["asd"]
//        
//        let person = Person(name: <#T##String#>, age: <#T##KotlinInt?#>, ofEmail: <#T##String#>)
//    
//        
//        
//    }
//
//    func test(index: Int) -> String {
//        return "test"
//    }
}
