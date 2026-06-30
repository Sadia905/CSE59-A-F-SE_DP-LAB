// Interface
interface OptimizableModel {
    void quantize();
}

// ResNet18 implementation
class ResNet18 implements OptimizableModel {
    public void quantize() {
        System.out.println("Applying int8 quantization for ResNet-18.");
    }
}

// MobileNet implementation
class MobileNet implements OptimizableModel {
    public void quantize() {
        System.out.println("Applying dynamic quantization for MobileNet.");
    }
}

// Inference Engine (no modification needed for new models)
class InferenceEngine {
    public void process(OptimizableModel model) {
        model.quantize();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        InferenceEngine engine = new InferenceEngine();

        OptimizableModel model1 = new ResNet18();
        OptimizableModel model2 = new MobileNet();

        engine.process(model1);
        engine.process(model2);
    }
}
