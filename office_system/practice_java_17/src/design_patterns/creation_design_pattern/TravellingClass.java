package design_patterns.creation_design_pattern;

public abstract class TravellingClass {
        protected double rate;
        abstract void getRate();
        public int processBill(int classType){
            return (int)(classType*rate);
        }
}
